//
//  DependenciesTests.swift
//  DependenciesTests
//
//  Created by Victoria Denisyuk on 10/28/16.
//  Copyright © 2016 Victoria Denisyuk. All rights reserved.
//

import XCTest

class DependenciesTests: XCTestCase {
    var deps: [DependencyDescription]? = [
        DependencyDescription("A", dependsOn:["B", "C"]),
        DependencyDescription("B", dependsOn:["C", "E"]),
        DependencyDescription("C", dependsOn:["G"]),
        DependencyDescription("D", dependsOn:["A", "F"]),
        DependencyDescription("E", dependsOn:["F"]),
        DependencyDescription("F", dependsOn:["H"])
    ]
    
    override func setUp() {
        super.setUp()
        // Put setup code here. This method is called before the invocation of each test method in the class.
    }
    
    override func tearDown() {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
        super.tearDown()
    }
    
    func testA() {
        let fullDeps = DependencyDescription.fullDependencies(search: "A", in: deps)
        let target = DependencyDescription("A", dependsOn: ["B", "C", "E", "F", "G", "H"])

        XCTAssert(fullDeps == target)
    }
    
    func testB() {
        let fullDeps = DependencyDescription.fullDependencies(search: "B", in: deps)
        let target = DependencyDescription("B", dependsOn: ["C", "E", "F", "G", "H"])
        
        XCTAssert(fullDeps == target)
    }

    func testC() {
        let fullDeps = DependencyDescription.fullDependencies(search: "C", in: deps)
        let target = DependencyDescription("C", dependsOn: ["G"])
        
        XCTAssert(fullDeps == target)
    }
    func testD() {
        let fullDeps = DependencyDescription.fullDependencies(search: "D", in: deps)
        let target = DependencyDescription("D", dependsOn: ["A", "B", "C", "E", "F", "G", "H"])
        
        XCTAssert(fullDeps == target)
    }
    func testE() {
        let fullDeps = DependencyDescription.fullDependencies(search: "E", in: deps)
        let target = DependencyDescription("E", dependsOn: ["F", "H"])
        
        XCTAssert(fullDeps == target)
    }
    func testF() {
        let fullDeps = DependencyDescription.fullDependencies(search: "F", in: deps)
        let target = DependencyDescription("F", dependsOn: ["H"])
        
        XCTAssert(fullDeps == target)
    }
    
    func testPerformanceExample() {
        // This is an example of a performance test case.
        self.measure {
            // Put the code you want to measure the time of here.
        }
    }
    
}
