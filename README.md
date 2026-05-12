# 🎓 Student Grade Calculator

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)
![Vercel](https://img.shields.io/badge/Vercel-000000?style=for-the-badge&logo=vercel&logoColor=white)

A comprehensive Grade Calculator that calculates total marks, average percentage, and assigns grades based on student performance.

</div>

---

## 📋 Table of Contents
- [Overview](#-overview)
- [Features](#-features)
- [How it Works](#-how-it-works)
- [Grade Mapping](#-grade-mapping)
- [Installation & Usage](#-installation--usage)
  - [Java Console Version](#java-console-version)
  - [Web Version](#web-version)
- [Deployment](#-deployment)
- [Technologies Used](#-technologies-used)

---

## 🔍 Overview
The **Student Grade Calculator** is designed to help students and teachers quickly calculate academic performance. Originally built as a Java console application, this repository now includes a **Web-based version** for easy access via any browser.

---

## ✨ Features
- **Dynamic Subject Input**: Enter marks for any number of subjects.
- **Input Validation**: Ensures marks are within the valid range (0-100).
- **Automated Calculations**: Instantly computes total marks and average percentage.
- **Smart Grading**: Automatically assigns letter grades (A+, A, B, C, D, F).
- **Responsive UI**: The web version works perfectly on desktops, tablets, and phones.

---

## ⚙️ How it Works
1. **Input Marks**: User enters marks obtained (out of 100) for each subject.
2. **Total Marks**: The system sums up all obtained marks.
3. **Average Percentage**: Calculated by dividing total marks by the number of subjects.
4. **Grade Assignment**: A grade is determined based on the percentage.
5. **Display**: Final results (Total, Average, Grade) are presented clearly.

---

## 📊 Grade Mapping
| Percentage Range | Grade |
| :--- | :---: |
| 95% - 100% | **A+** |
| 90% - 94.9% | **A** |
| 80% - 89.9% | **B** |
| 70% - 79.9% | **C** |
| 60% - 69.9% | **D** |
| Below 60% | **F** |

---

## 🚀 Installation & Usage

### Java Console Version
1. Ensure you have [JDK](https://www.oracle.com/java/technologies/downloads/) installed.
2. Navigate to `Codsoft_Assignment1_Q2/src`.
3. Compile the file:
   ```bash
   javac Calculator/Student_Grade_Calculator.java
   ```
4. Run the program:
   ```bash
   java Calculator.Student_Grade_Calculator
   ```

### Web Version
Simply open `public/index.html` in any web browser, or visit the [Live Demo](#-deployment).

---

## ☁️ Deployment
This project is configured for one-click deployment on **Vercel**.

### Local Preview
```bash
npx vercel dev
```

### Production Deploy
```bash
npx vercel --prod
```

---

## 🛠 Technologies Used
- **Backend/Logic**: Java (Console Version)
- **Frontend**: HTML5, CSS3 (Modern Flexbox/Grid), JavaScript (ES6+)
- **Hosting**: Vercel

---

<div align="center">

Made with ❤️ for Academic Excellence

⭐ Star this repo if you found it useful!

</div>
