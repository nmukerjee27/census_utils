# Set up the package
.First.lib <- function(lib,pkg){
	.jpackage("CensusMerge", lib.loc=lib, jars='*')
	cat("CensusMerge has been loaded.\n")
}
