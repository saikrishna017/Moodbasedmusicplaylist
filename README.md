## Mood-Based Music Playlist Generator
Mood-Based Music Playlist Generator is a Java console application that recommends songs based on the user's mood, including Happy, Sad, Motivated, and Romantic.
 It uses OOP principles, enums for mood categorization, and collections for storing and retrieving songs.
 The program showcases file-free, in-memory data handling for quick response, and is designed to be simple yet engaging for end users.
 This project demonstrates Java fundamentals, user input handling, and basic filtering logic in a fun, real-world-inspired scenario.
## Features
- Select mood from menu.
- Get a curated list of songs for that mood.
- Preloaded playlist stored in code (easy to expand).
- Demonstrates:
  - **OOP concepts**
  - **Collections Framework**
  - **Enums for mood categories**
  - **Basic search & filter logic**
  - **Console-based user interaction**
## Project Structure
MoodBasedMusicPlaylist/
│
├── src/
│ ├── Main.java
│ ├── Mood.java
│ ├── Song.java
│ └── Playlist.java
│
├── out/ (compiled .class files)
└── README.md
## How to Run
### Using Command Line
1. Open terminal/PowerShell in project folder.
2. Compile:
   ```bash
   javac -d out (Get-ChildItem -Path src -Filter *.java).FullName
  Run:
  java -cp out Main
