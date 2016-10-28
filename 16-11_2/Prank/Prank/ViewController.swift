//
//  ViewController.swift
//  Prank
//
//  Created by Victoria Denisyuk on 11/25/16.
//  Copyright © 2016 Victoria Denisyuk. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        let message = "I've been texting u for two days, please answer me, i miss you"
        let fixed = Autocorrect.autocorrect(message: message)
        print(fixed)
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

