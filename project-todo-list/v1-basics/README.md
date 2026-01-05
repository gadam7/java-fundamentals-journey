# Todo List Manager - Version 1 (Basics)

## Overview
A simple console-based Todo List Manager built using only Phase 1 Java concepts:
- Arrays
- Methods
- Loops
- Control flow (if/else, switch)
- Basic data types

## Features
- ✅ Add new tasks
- ✅ View all tasks
- ✅ Mark tasks as complete
- ✅ Delete tasks
- ✅ Simple menu system

## How to Run

```bash
# Navigate to this directory
cd project-todo-list/v1-basics

# Compile
javac TodoListApp.java

# Run
java TodoListApp
```

## Technical Details

### Data Structure
- Uses parallel arrays to store task data:
  - `String[] taskTitles` - Task titles
  - `String[] taskDescriptions` - Task descriptions
  - `boolean[] taskStatus` - Completion status (true = done)
  - `int taskCount` - Current number of tasks

### Limitations (by design for Phase 1)
- Maximum 50 tasks
- No data persistence (resets on exit)
- No priority levels
- No due dates
- No categories

*These limitations will be addressed in future versions as we learn more Java concepts!*

## What You'll Learn
- Organizing code with methods
- Working with arrays
- Building interactive console applications
- Input validation
- Menu-driven programs

## Next Version Preview

**v2 (OOP):** Will introduce:
- Task class with encapsulation
- TaskManager class
- Better code organization
- Object-oriented design

---

**Version:** 1.0.0  
**Phase:** Java Basics  
**Concepts Used:** Arrays, Methods, Loops, Control Flow