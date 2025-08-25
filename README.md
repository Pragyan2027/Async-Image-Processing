🖼️ JavaFX Image Processing (Tile-Based)

A JavaFX desktop application for tile-based image processing.
It loads an image, splits it into tiles, applies filters (like grayscale), and progressively renders them on a canvas.

✨ Features

📂 Load images (JPG/PNG) into the app

🎨 Apply filters (e.g., grayscale, color transforms, custom filters)

🧩 Tile-based processing (split image into chunks)

⚡ Progressive rendering on a JavaFX canvas

🛠️ Extendable: plug in your own custom filters

🔄 Concurrent processing for faster performance

🧠 Concepts Used
🔹 Core Java

Streams API → clean functional style for iterating tiles

Multithreading → multiple tiles processed in parallel

Concurrency → safe coordination between worker threads and JavaFX Application Thread

🔹 JavaFX

Canvas-based rendering

Scene Graph management

Event-driven architecture

🔹 Low-Level Design (LLD)

Interface-based design (ImageFilter)

Singleton pattern (DrawMultipleImagesOnCanvas)

Separation of Concerns (I/O, Filters, Processing, Rendering modules)

🔹 LLM-Assisted Development

Prompt Engineering → refining filters & debugging rendering issues

LLM Pair Programming → modular design decisions (e.g., ImageData, ImageProcessor)

Human + AI Feedback Loop → iterative testing, debug logs, and fixes guided by AI

🛠️ Tech Stack

Java 21+

JavaFX 21 LTS

Maven / Gradle (build tool)

AWT + BufferedImage for pixel processing
