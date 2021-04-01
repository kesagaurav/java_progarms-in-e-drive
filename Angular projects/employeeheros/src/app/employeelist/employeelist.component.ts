import { Component, OnInit } from '@angular/core';

  export class Employee{
    constructor(
      public id:number,
      public name:string,
      public password:string
    ){

    }
  }


@Component({
  selector: 'app-employeelist',
  templateUrl: './employeelist.component.html',
  styleUrls: ['./employeelist.component.css']
})
export class EmployeelistComponent implements OnInit {

  employees=[
    new Employee(1,'gaurav1','deepa123456'),
    new Employee(2,'gaurav2','deepa1234567'),
    new Employee(3,'gaurav3','deepa1234568')
 
  ]

  // employee={
  //     id:1,
  //     name:'gaurav',
  //     password:'123abc'
  // };


  constructor() { }

  ngOnInit(): void {
  }

}
