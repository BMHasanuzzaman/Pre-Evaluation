import { Component, OnInit } from '@angular/core';
import {Observable} from 'rxjs';
import {Router} from '@angular/router';
import {User} from '../../../classes/user';
import {UserService} from '../../../services/user.service';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

  users: Observable<User[]>;

  constructor(private userService: UserService, private router: Router) { }

  ngOnInit(): void {
    console.log('User list');
    this.reloadData();
  }

  reloadData(){
    this.users = this.userService.getAll();
    console.log(this.users);
  }

  deleteUser(id: string) {
    this.userService.delete(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  userDetails(id: string){
    this.router.navigate(['userDetails']);
  }


  updateUser(id: string){
    this.router.navigate(['updateUser']);
  }
}
