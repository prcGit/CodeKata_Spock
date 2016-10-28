//
//  Autocorrect.swift
//  Prank
//
//  Created by Victoria Denisyuk on 11/25/16.
//  Copyright © 2016 Victoria Denisyuk. All rights reserved.
//

import Foundation

let replacement = "your sister"
let mentions = ["you", "u"]
class Autocorrect {
    static func autocorrect(message: String) -> String {
        let regex = try! NSRegularExpression(pattern: "\\b(yo)?u\\b", options: .caseInsensitive)
        let res = regex.stringByReplacingMatches(in: message, options: [], range: NSRange(0..<message.characters.count), withTemplate: replacement)
        return res
    }
}
