//
//  PrankTests.swift
//  PrankTests
//
//  Created by Victoria Denisyuk on 11/25/16.
//  Copyright © 2016 Victoria Denisyuk. All rights reserved.
//

import XCTest
@testable import Prank

class PrankTests: XCTestCase {
    
    override func setUp() {
        super.setUp()
        // Put setup code here. This method is called before the invocation of each test method in the class.
    }
    
    override func tearDown() {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
        super.tearDown()
    }
    
    func testExample() {
        // This is an example of a functional test case.
        // Use XCTAssert and related functions to verify your tests produce the correct results.
    }
    
    func testString() {
        XCTAssert(Autocorrect.autocorrect(message: "I've been texting u for two days, please answer me, i miss you") ==
            ("I\'ve been texting your sister for two days, please answer me, i miss your sister"))
    }
    
    func testYou() {
        XCTAssert(Autocorrect.autocorrect(message: "i miss you, Lola") ==
            ("i miss your sister, Lola"))
    }
    
    func testWords() {
        XCTAssert(Autocorrect.autocorrect(message: "u so perfect") ==
            ("your sister so perfect"))
    }
    
    func testPerformanceExample() {
        // This is an example of a performance test case.
        self.measure {
            // Put the code you want to measure the time of here.
        }
    }
    
}
