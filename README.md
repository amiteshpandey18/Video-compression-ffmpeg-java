# 🎥 Video Compression Project using FFmpeg (Java)

## 📌 Overview
This project demonstrates video compression using **FFmpeg** integrated with **Java**.
It reduces video file size while preserving acceptable video quality.

## 🛠️ Technologies Used
- Java
- FFmpeg
- Eclipse IDE
- Command-line process handling

## ⚙️ Features
- Video compression using FFmpeg codecs
- Adjustable resolution and bitrate
- Efficient storage optimization

## 🚀 How to Run
1. Install FFmpeg and add it to system PATH
2. Clone the repository
3. Open project in Eclipse
4. Run `VideoCompressor.java`
5. Provide input and output video paths

## 🧪 Sample FFmpeg Command Used
```bash
ffmpeg -i input.mp4 -vcodec libx264 -crf 28 output.mp4
