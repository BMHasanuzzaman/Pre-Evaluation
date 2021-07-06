import { Component, OnInit } from '@angular/core';
import {TestServiceService} from '../../../services/test-service.service';
import {Greeting} from "../../../classes/greeting";

@Component({
  selector: 'app-test-component',
  templateUrl: './test-component.component.html',
  styleUrls: ['./test-component.component.css']
})
export class TestComponentComponent implements OnInit {
  greeting: Greeting;
  constructor(private testService: TestServiceService) { }

  ngOnInit(): void {
    this.testService.getGreeting().subscribe(
      data => {
        console.log(data);
        this.greeting = data;
      }
    );
  }

}
