# Set up the package
.onLoad <- function(libname, pkgname){
  .jpackage(pkgname, lib.loc=libname, jars='*')
}
