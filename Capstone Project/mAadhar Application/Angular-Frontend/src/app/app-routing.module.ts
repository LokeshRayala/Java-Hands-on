import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { FormComponent } from './form/form.component';
import { ImagesComponent } from './images/images.component';
import { UserDashComponent } from './user-dash/user-dash.component';
import { UserLoginComponent } from './user-login/user-login.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [
  {"path":"user",component:UserLoginComponent},
  {"path":"admin",component:AdminLoginComponent},
  {"path":"",component:DashboardComponent},
  {"path":"users",component:UserComponent},
  {"path":"form",component:FormComponent},
  {"path":"user-dash",component:UserDashComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
