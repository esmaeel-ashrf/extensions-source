rootProject.name = "extensions"

// include MangaPro
include("src:ar:mangapro")
project(":src:ar:mangapro").projectDir = file("src/ar/mangapro")

// include lib-multisrc template that MangaPro depends on
include("lib-multisrc:iken")
project(":lib-multisrc:iken").projectDir = file("lib-multisrc/iken")
