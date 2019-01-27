//
//  ViewController.swift
//  labiOS
//
//  Created by PWr.Macbook.8 on 18/12/2018.
//  Copyright © 2018 PWr.Macbook.8. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    
    
    @IBOutlet weak var temperatureText: UITextField!
    
    @IBOutlet weak var resultTxt: UITextField!

    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }
    
    
    @IBAction func convertTemp(_ sender: Any) {
        if let celsius = Double(temperatureText.text!) {
            let kelvin = celsius + 274.15
            let result = "Temperatura: \(kelvin) K"
            resultTxt.text = result
        }
    }
    
    
    @IBAction func clearText(_ sender: Any) {
        temperatureText.text = ""
    }
    

}

