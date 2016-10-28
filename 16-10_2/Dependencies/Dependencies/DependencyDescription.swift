//
//  DependencyDescription.swift
//  Dependencies
//
//  Created by Victoria Denisyuk on 10/28/16.
//  Copyright © 2016 Victoria Denisyuk. All rights reserved.
//

import Foundation

import UIKit

class DependencyDescription: CustomStringConvertible, Equatable {
    /// Returns a Boolean value indicating whether two values are equal.
    ///
    /// Equality is the inverse of inequality. For any values `a` and `b`,
    /// `a == b` implies that `a != b` is `false`.
    ///
    /// - Parameters:
    ///   - lhs: A value to compare.
    ///   - rhs: Another value to compare.
    public static func ==(lhs: DependencyDescription, rhs: DependencyDescription) -> Bool {
        return lhs.item == rhs.item && lhs.dependencies == rhs.dependencies
    }
    
    let item: String
    var dependencies: Set<String> = Set()
    init(_ item: String, dependsOn: Set<String>) {
        self.item = item
        self.dependencies = dependsOn
    }
    init(_ item: String) {
        self.item = item
    }
    
    func append(_ dependency: DependencyDescription?) {
        guard let dep = dependency else { return }
        dependencies = dependencies.union(dep.dependencies)
    }
    
    var description: String {
        return item+":"+(dependencies.sorted().description)
    }
    
    
    static func fullDependencies(search: String, in deps: [DependencyDescription]? ) -> DependencyDescription? {
        guard let deps = deps else {return nil}
        let fullDependency = DependencyDescription(search)
        let depList = deps.filter {$0.item == search}.first
        
        //recursive deps
        if let addedDeps = depList?.dependencies {
            fullDependency.append(depList)
            for addedDep in addedDeps {
                if let subdepList = DependencyDescription.fullDependencies(search: addedDep, in:deps) {
                    fullDependency.append(subdepList)
                }
            }
        }
        
        print("\nDependency list \(fullDependency)\n")
        return fullDependency
    }
}
