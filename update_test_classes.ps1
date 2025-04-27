# PowerShell script to update test classes
$testFiles = Get-ChildItem -Path "src/test/java" -Filter "*test.java" -Recurse

foreach ($file in $testFiles) {
    $content = Get-Content $file.FullName -Raw
    
    # Skip if already extends NetworkMonitoringBase
    if ($content -match "extends\s+NetworkMonitoringBase") {
        Write-Host "Skipping $($file.Name) - already extends NetworkMonitoringBase"
        continue
    }
    
    # Add import if not present
    if (-not ($content -match "import\s+\.base\.NetworkMonitoringBase")) {
        $content = $content -replace "(package.*?;)", "`$1`n`nimport base.NetworkMonitoringBase;"
    }
    
    # Update class declaration to extend NetworkMonitoringBase
    $content = $content -replace "(public\s+class\s+\w+)(\s*\{)", "`$1 extends NetworkMonitoringBase `$2"
    
    # Remove duplicate WebDriver declarations
    $content = $content -replace "private\s+WebDriver\s+driver;`n", ""
    
    # Write back to file
    $content | Set-Content $file.FullName -NoNewline
    Write-Host "Updated $($file.Name)"
} 