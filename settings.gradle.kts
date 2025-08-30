rootProject.name = "extensions"

// ==================== Core ====================
include(":core")
project(":core").projectDir = file("core")

// ==================== MangaPro extension ====================
include(":src:ar:mangapro")
project(":src:ar:mangapro").projectDir = file("src/ar/mangapro")

// ==================== Iken multisrc template ====================
include(":lib-multisrc:iken")
project(":lib-multisrc:iken").projectDir = file("lib-multisrc/iken")
