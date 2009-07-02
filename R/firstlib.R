# Set up the package
.First.lib <- function(lib,pkg){
	.jpackage(pkg,
                  morePaths=file.path(lib, 'com/JoshuaJustice/CensusMerge/'),
                  nativeLibrary=FALSE, lib.loc=lib)
	cat("CensusMerge has been loaded.\n")
}
