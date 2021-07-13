import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { RouterModule } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { TutorialDetailsComponent } from './components/tutorial/tutorial-details/tutorial-details.component';
import { CreateTutorialComponent } from './components/tutorial/create-tutorial/create-tutorial.component';
import { UpdateTutorialComponent } from './components/tutorial/update-tutorial/update-tutorial.component';
import { TutorialListComponent } from './components/tutorial/tutorial-list/tutorial-list.component';
import {FormsModule} from '@angular/forms';
import { AddUserComponent } from './components/user/add-user/add-user.component';
import { UpdateUserComponent } from './components/user/update-user/update-user.component';
import { UserDetailsComponent } from './components/user/user-details/user-details.component';
import { UserListComponent } from './components/user/user-list/user-list.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';




@NgModule({
  declarations: [
    AppComponent,
    TutorialDetailsComponent,
    CreateTutorialComponent,
    UpdateTutorialComponent,
    TutorialListComponent,
    AddUserComponent,
    UpdateUserComponent,
    UserDetailsComponent,
    UserListComponent
  ],
    imports: [
        RouterModule,
        BrowserModule,
        AppRoutingModule,
        HttpClientModule,
      BrowserAnimationsModule,
      FormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
