# Automation Hybrid Framework

A comprehensive test automation framework that combines Selenium WebDriver for web automation, Appium for mobile automation, and TestNG for test management. This framework follows the Page Object Model (POM) design pattern and uses Maven for dependency management.

## Key Components

- **Selenium WebDriver**: Web automation
- **Appium**: Mobile automation
- **TestNG**: Test management and execution
- **Maven**: Project and dependency management
- **Allure**: Test reporting

## Project Structure

```
automationframework/
├── TestNg/
├── src/
│   ├── main/
│   │   ├── automation.allure/               # Allure functionality
│   │   ├── automation.dashboard/            # Dashboard functionality
│   │   ├── automation.date/                 # Date generator functions
│   │   ├── automation.factory/              # Factory classes
│   │   ├── automation.logintest/            # Login functionality
│   │   ├── automation.pages/                # Page Object classes
│   │   └── automation.utils/                # Utility classes
│   │   └── automation.web resources/        # various web resources
│   └── test/
│       ├── automation.baseTest/             # Base test class
│       ├── automation.dashboard.advocate/   # Advocate dashboard tests
│       ├── automation.logintest/            # Login tests
├── Config.properties
├── pom.xml
└── test-suites/
    ├── web/                         # Web test suites

```

## Setup Instructions

### 1. Prerequisites

- Java JDK (Latest LTS version)
- Eclipse IDE/Visual Studio Code / IntelliJ IDEA/Cursor
- Maven
- Node.js (for Appium)

### 2. Java Installation

#### Windows:
1. Download Java from [Oracle Java SE Downloads](https://www.oracle.com/java/technologies/javase-downloads.html)
2. Run the installer
3. Set JAVA_HOME environment variable:
   ```
   Variable Name: JAVA_HOME
   Variable Value: C:\Program Files\Java\jdk1.8.0_281
   ```
4. Add to PATH: `%JAVA_HOME%\bin`

#### macOS:
1. Download Java from Oracle website
2. Run the DMG installer
3. Verify installation:
   ```bash
   java -version
   javac -version
   ```

### 3. Eclipse Setup

1. Download Eclipse IDE from [Eclipse Downloads](https://www.eclipse.org/downloads/)
2. Choose "Eclipse IDE for Java Developers"
3. Install and configure workspace

### 4. Maven Project Setup

1. Create new Maven project in Eclipse
2. Add dependencies to `pom.xml`:
   ```xml
   <dependencies>
       <dependency>
           <groupId>org.testng</groupId>
           <artifactId>testng</artifactId>
           <version>7.8.0</version>
           <scope>test</scope>
       </dependency>
       <!-- Add other dependencies as needed -->
   </dependencies>
   ```
## Jenkins Setup (macOS)

```bash
# Install Jenkins LTS
brew install jenkins-lts

# Start Jenkins
brew services start jenkins-lts

# Restart Jenkins
brew services restart jenkins-lts

# Update Jenkins
brew upgrade jenkins-lts
```

## Useful Links

- [Git Commands Reference](https://confluence.atlassian.com/bitbucketserver/basic-git-commands-776639767.html)

## Git Commands

```bash
# Remove existing remote
git remote rm origin

# Add new remote
git remote add origin https://your-repository-url.git
```

## Git Configuration

```bash
# Set your Git email
git config --global user.email "your.email@example.com"

# Set your Git username
git config --global user.name "Your Name"

# Verify settings
git config --global user.email
git config --global user.name

# View all Git configurations
git config --list
```

## Branch Management and Pushing Changes

```bash
# Check current branch
git branch

# Add all changes
git add .

# Commit changes
git commit -m "Your commit message"

# Switch to main branch
git checkout main

# Merge changes from feature branch
git merge feature/newbranch09march2025

# Push changes to main branch
git push origin main

# Delete feature branch (optional, after successful merge)
git branch -d feature/newbranch09march2025
```

## Allure setup via scoop
### ✅ **Steps to Install Scoop on Windows**

1. **Open PowerShell as Administrator**
   - Press `Win + X` → Select **Windows PowerShell (Admin)** or **Terminal (Admin)**.
   - Run the following command to allow script execution:
   ```powershell
   Set-ExecutionPolicy RemoteSigned -Scope CurrentUser
   ```

2. **Install Scoop**
   - Run the following command to install Scoop:
   ```powershell
   irm get.scoop.sh | iex
   ```

3. **Verify Installation**
   - Once installed, verify by running:
   ```powershell
   scoop --version
   ```

### ✅ **Optional: Add Additional Buckets**
- To add the **main** bucket (default):
```powershell
scoop bucket add main
```
- To add **extras** (contains more applications):
```powershell
scoop bucket add extras
```
### ✅ **Steps to Install Allure on Windows Using Scoop**

1. **Open PowerShell as Administrator**
   - Press `Win + X` → Select **Windows PowerShell (Admin)**.

2. **Add the Scoop `extras` Bucket**
   - If you haven't added the `extras` bucket yet, run:
   ```powershell
   scoop bucket add extras
   ```

3. **Install Allure**
   - Run the following command:
   ```powershell
   scoop install allure
   ```

4. **Verify Installation**
   - Check if Allure is installed successfully by running:
   ```powershell
   allure --version
   ```
