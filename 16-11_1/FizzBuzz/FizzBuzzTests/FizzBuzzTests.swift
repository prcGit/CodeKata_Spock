//
//  FizzBuzzTests.swift
//  FizzBuzzTests
//
//  Created by Victoria Denisyuk on 11/11/16.
//  Copyright © 2016 Victoria Denisyuk. All rights reserved.
//

import XCTest


class FizzBuzzTests: XCTestCase {

    override func setUp() {
        super.setUp()
        // Put setup code here. This method is called before the invocation of each test method in the class.
    }

    override func tearDown() {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
        super.tearDown()
    }

    func testFizz() {
        XCTAssert(FizzBuzz.fizzbuzz(3) == "Fizz!")
    }

    func testBuzz() {
        XCTAssert(FizzBuzz.fizzbuzz(20) == "Buzz!")
    }

    func testFizzBuzz() {
         XCTAssert(FizzBuzz.fizzbuzz(90) == "FizzBuzz!")
    }

    func testNumber() {
        XCTAssert(FizzBuzz.fizzbuzz(17) == "17")
    }


    func testPerformanceExample() {
        // This is an example of a performance test case.
        self.measure {
            // Put the code you want to measure the time of here.
        }
    }

}
