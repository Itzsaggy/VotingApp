import { Component } from '@angular/core';
import { PollComponent } from './poll/poll.component';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [PollComponent, HttpClientModule], // Add HttpClientModule
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'poll-app';
}