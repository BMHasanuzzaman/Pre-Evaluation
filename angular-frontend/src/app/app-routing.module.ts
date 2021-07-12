import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateTutorialComponent } from './components/tutorial/create-tutorial/create-tutorial.component';
import { TutorialDetailsComponent } from './components/tutorial/tutorial-details/tutorial-details.component';
import { UpdateTutorialComponent } from './components/tutorial/update-tutorial/update-tutorial.component';
import { TutorialListComponent } from './components/tutorial/tutorial-list/tutorial-list.component';
import {AddUserComponent} from './components/user/add-user/add-user.component';
import {UserDetailsComponent} from './components/user/user-details/user-details.component';
import {UserListComponent} from './components/user/user-list/user-list.component';
import {UpdateUserComponent} from './components/user/update-user/update-user.component';


const routes: Routes = [
  { path: '', redirectTo: 'tutorial', pathMatch: 'full' },
  { path: 'tutorials', component: TutorialListComponent},
  { path: 'details/:id', component: TutorialDetailsComponent },
  { path: 'create', component: CreateTutorialComponent },
  { path: 'update/:id', component: UpdateTutorialComponent},
  { path: 'createUser', component: AddUserComponent},
  { path: 'userList', component: UserListComponent},
  { path: 'updateUser', component: UpdateUserComponent},
  { path: 'userDetails', component: UserDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
