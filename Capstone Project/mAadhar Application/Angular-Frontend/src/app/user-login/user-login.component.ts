import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent implements OnInit {

  registerForm!: FormGroup;
  uemail: string = '';
  upassword: string = '';
  submitted: boolean = false;
  constructor(private builder: FormBuilder, private router: Router) {}

  ngOnInit(): void {
    this.registerForm = this.builder.group({
      uemail: [''],
      upassword: [''],
    });
  }

  OnSubmit() {
    this.submitted = true;

    this.uemail = this.registerForm.get('uemail')?.value;
    this.upassword = this.registerForm.get('upassword')?.value;
    if (this.uemail == 'user' && this.upassword == 'user') {
      this.router.navigate(['user-dash']);
    } else {
      alert('wrong credential');
    }
  }

}
