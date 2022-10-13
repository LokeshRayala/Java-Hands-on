import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {

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
    if (this.uemail == 'admin' && this.upassword == 'admin') {
      this.router.navigate(['users']);
    } else {
      alert('wrong credential');
    }
  }

}
