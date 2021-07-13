import { Component, OnInit } from '@angular/core';
import {Observable} from 'rxjs';
import {User} from '../../../classes/user';
import {UserService} from '../../../services/user.service';
import {ActivatedRoute, Router} from '@angular/router';
import {Tutorial} from '../../../classes/tutorial';
import {TutorialService} from '../../../services/tutorial.service';

@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {

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

  list(){
    this.router.navigate(['userList']);
  }
  updateUser(){
    this.router.navigate(['updateUser/'+this.user.id]);
  }

}
