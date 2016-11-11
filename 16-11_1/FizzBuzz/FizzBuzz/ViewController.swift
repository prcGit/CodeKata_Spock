//
//  ViewController.swift
//  FizzBuzz
//
//  Created by Victoria Denisyuk on 11/11/16.
//  Copyright © 2016 Victoria Denisyuk. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        FizzBuzz.doCount()
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    
}
