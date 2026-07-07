Architecture

Overview

Dearog Password Manager follows a modern Android architecture designed for security, scalability, maintainability, and testability.

The application is built using Kotlin, Jetpack Compose, MVVM, Clean Architecture, and dependency injection with Hilt.

---

Architecture Layers

Presentation
       │
       ▼
Domain
       │
       ▼
Data
       │
       ▼
Local Storage / Android Services

Each layer has a single responsibility and communicates only with adjacent layers.

---

Project Structure

PasswordManager/
│
├── app/
├── docs/
├── assets/
├── branding/
├── design/
├── scripts/
├── tools/
├── .github/
└── gradle/

Inside the application source:

app/src/main/java/com/dearog/passwordmanager/

common/
core/
data/
domain/
features/
security/
services/
workers/
navigation/
di/
receivers/
widgets/
shortcuts/

---

Presentation Layer

Responsible for the user interface.

Components include:

- Jetpack Compose Screens
- ViewModels
- UI State
- UI Events
- Navigation
- Reusable Components

The Presentation layer never accesses the database directly.

---

Domain Layer

Contains the application's business logic.

Includes:

- Use Cases
- Domain Models
- Repository Interfaces
- Validators

The Domain layer is independent of Android framework classes whenever practical.

---

Data Layer

Responsible for data management.

Includes:

- Room Database
- DataStore
- Repository Implementations
- Local Data Sources
- Import/Export
- Backup
- Sync
- Mappers

---

Security Layer

Dedicated security components include:

- Encryption
- Android Keystore
- Master Password
- PIN
- Biometrics
- Passkeys
- TOTP
- Clipboard Protection
- Session Management
- Security Audit

No sensitive information should be stored unencrypted.

---

Dependency Injection

Dependency injection is handled with Hilt.

Modules provide:

- Database
- Repositories
- DataStore
- Security
- Workers
- Notifications
- ViewModels
- Dispatchers

---

Navigation

Navigation is implemented using Jetpack Compose Navigation.

Each feature owns its navigation destinations where appropriate.

---

Background Work

Background tasks use WorkManager.

Examples include:

- Automatic Backup
- Clipboard Cleanup
- Vault Lock
- Password Health Scan
- Database Maintenance
- Widget Updates

---

Data Flow

User Action
      │
      ▼
Compose Screen
      │
      ▼
ViewModel
      │
      ▼
Use Case
      │
      ▼
Repository
      │
      ▼
Local Data Source
      │
      ▼
Room / DataStore

The result flows back through the same path to update the UI.

---

Design Principles

The project follows these principles:

- Single Responsibility Principle
- Separation of Concerns
- Dependency Inversion
- Feature-based organization
- Offline-first design
- Security by default
- Testability
- Maintainability
- Reusability

---

Testing Strategy

The project includes:

- Unit Tests
- Instrumentation Tests
- UI Tests
- Performance Benchmarks

Testing is performed throughout the application lifecycle.

---

Scalability

The architecture is designed to support future features, including:

- Cloud synchronization
- Multiple vaults
- Wear OS
- Tablet optimization
- Desktop companion
- Browser extension integration

---

Conclusion

The goal of this architecture is to provide a secure, maintainable, and scalable foundation for Dearog Password Manager while keeping the codebase modular, easy to understand, and suitable for long-term open-source development.