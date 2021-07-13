import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {User} from '../../../classes/user';
import {UserService} from '../../../services/user.service';

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class UpdateUserComponent implements OnInit {

  id: bigint;
  user: User;

  constructor(private route: ActivatedRoute, private router: Router,
              private userService: UserService) { }

  ngOnInit() {
    this.user = new User();

    this.id = this.route.snapshot.params['id'];
    this.userService.get(this.id)
      .subscribe(data => {
        console.log(data);
        this.user = data;
      }, error => console.log(error));
  }

  updateUser(){
    this.userService.update(this.id, this.user).subscribe(
      data => {
        console.log(data);
        this.user = new User();
        this.list();
      }, error => console.log(error)
    );
  }

  onSubmit(){
    this.updateUser();
  }

  list(){
    this.router.navigate(['userList']);
  }

}
