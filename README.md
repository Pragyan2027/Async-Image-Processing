# 🖼️ JavaFX Tile-Based Image Processing

A **JavaFX desktop application** that demonstrates **tile-based image processing**.  
It loads an image, splits it into smaller tiles, applies filters (e.g., grayscale), and progressively renders them on a JavaFX canvas.

---

## ✨ Features

- **📂 Load images** (JPG/PNG) into the app
- **🎨 Apply filters**: grayscale, color transforms, custom effects
- **🧩 Tile-based processing**: split images into chunks for efficient rendering
- **⚡ Progressive rendering**: render tiles step by step on JavaFX canvas
- **🛠️ Easily extendable**: add custom filters
- **🔄 Concurrent processing**: utilize multiple threads for performance boost

---

## 🧠 Concepts Used

### 🔹 Core Java
- **Streams API** → functional, concise tile iteration  
- **Multithreading & Concurrency** → parallel tile processing with safe coordination  
- **AWT + BufferedImage** → low-level pixel manipulation

### 🔹 JavaFX
- **Canvas-based rendering** → draw and update tiles efficiently  
- **Scene Graph management** → structured UI  
- **Event-driven architecture** → interactive image processing

### 🔹 Low-Level Design (LLD)
- **Interface-driven design** → `ImageFilter` abstraction for filters  
- **Singleton pattern** → centralized `DrawMultipleImagesOnCanvas` manager  
- **Separation of Concerns** → I/O, Filters, Processing, and Rendering in distinct modules

### 🔹 LLM-Assisted Development
- **Prompt Engineering** → refining filters & debugging rendering issues  
- **LLM Pair Programming** → guided modular design (`ImageData`, `ImageProcessor`)  
- **Human + AI Feedback Loop** → iterative testing and debugging with AI assistance

---

## 🛠️ Tech Stack

- **☕ Java 21+**  
- **🎨 JavaFX 21 LTS**  
- **📦 Maven / Gradle** (build tool)  
- **🖼️ AWT + BufferedImage** for pixel-level processing

---

**This project demonstrates combining modern JavaFX UI with high-performance tile-based image processing, making it easy to extend and optimize.**
