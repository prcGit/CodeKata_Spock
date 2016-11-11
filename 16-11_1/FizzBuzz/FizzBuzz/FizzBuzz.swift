//
//  FizzBuzz.swift
//  FizzBuzz
//
//  Created by Victoria Denisyuk on 11/11/16.
//  Copyright © 2016 Victoria Denisyuk. All rights reserved.
//

import Foundation

class FizzBuzz {
    static func fizzbuzz(_ i: Int) -> String {
        let fizz = i % 3
        let buzz = i % 5
        
        var answer = ""
        
        if fizz == 0 {
            answer += "Fizz"
        }
        
        if buzz == 0 {
            answer += "Buzz"
        }
        
        if !answer.isEmpty {
            return answer + "!"
        } else {
            return String(i)
            
        }
    }
    
    static func doCount(){
        var i = 1
        while i < 100 {
            
            print(FizzBuzz.fizzbuzz(i))
            i += 1
        }
    }
}
