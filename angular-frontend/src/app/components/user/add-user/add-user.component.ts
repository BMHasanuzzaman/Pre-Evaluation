import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import {User} from '../../../classes/user';
import {UserService} from '../../../services/user.service';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {

  user: User = new User();
  submitted = false;

  constructor(private userService: UserService,
              private router: Router) { }

  ngOnInit() {
  }

  newTutorial(): void {
    this.submitted = false;
    this.user = new User();
  }

  save() {
    this.userService
      .create(this.user).subscribe(data => {
        console.log(data);
        this.user = new User();
        console.log(this.user);
        this.gotoList();
      },
      error => console.log(error));
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }

  gotoList() {
    this.router.navigate(['/userList']);
  }

}
