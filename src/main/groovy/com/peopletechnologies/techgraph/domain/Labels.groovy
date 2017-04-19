package com.peopletechnologies.techgraph.domain

import groovy.transform.ToString

/**
 * Created by lee on 4/15/17.
 */
@ToString(includePackage = false,includeNames = true)
enum Labels {
    ComputerLanguage,
    FunctionalLanguage,
    ObjectOrientedLanguage,
    NativeCompiled,

    VirtualMachine,
    Compiler,
    Persistence,
    JavaBytecode,
    ORM,
    StreamProcessing,
}
