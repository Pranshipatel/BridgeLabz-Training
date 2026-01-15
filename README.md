## Data Structures

### 📅 Day 16 – Data Structures Overview & Linked Lists  
**(Date: 03-Jan-2026)**

### 📘 Topics Covered

- Understood the **fundamentals of Data Structures**:
  - Learned how data structures organize and store data efficiently.
  - Studied common examples such as Linked Lists.

- Explored **Key Features of Data Structures in Java**:
  - **Dynamic Memory Allocation**:
    - Learned how structures like Lists and Maps grow and shrink dynamically.
  - **Generics Support**:
    - Ensured type safety and reduced runtime errors.
 
- Studied **Types of Data Structures in Java**:
  - **Linear Data Structures**:
    - Array (fixed-size, contiguous memory).
    - Linked List (dynamic node-based structure).
    - Circular Linked list.
    - Linear Linked List.
    - Doubly Linked List. 
 

🔗 **Code Link:**  
👉 [*Day 16 – Linked List - Data Structures)*](https://github.com/Pranshipatel/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-codebase/JavaDsaProgramming/src/com/linkedlist)

---
### 📅 Day 17 – Stack, Queue & Hashing Fundamentals  
**(Date: 04-Jan-2026)**

### 📘 Topics Covered

- Studied **Stack Data Structure (LIFO)**:
  - Understood core operations: `push`, `pop`, `peek`, `isEmpty`.
  - Explored real-world use cases:
    - Function call stack in recursion.
    - Undo/Redo operations.
    - Expression evaluation and parenthesis matching.

- Learned **Queue Data Structure (FIFO)**:
  - Understood key operations: `offer`, `poll`, `peek`, `isEmpty`.
  - Explored Java Queue implementations:
    - `LinkedList`
    - `PriorityQueue`
    - `ArrayDeque`
  - Implemented **Ticket Counter Management System**:
    - Enqueued customers as they arrived.
    - Dequeued customers in order of service.
  - Studied queue usage in:
    - Task scheduling.
    - BFS traversal.
    - Request handling systems.

- Explored **HashMap & Hashing Concepts**:
  - Understood key-value pair storage using `HashMap`.
  - Learned core methods: `put`, `get`, `remove`, `containsKey`.
  - Implemented word frequency counting using HashMap.
  - Studied internal working of HashMap:

🔗 **Code Link:**  
👉 [*Day 17 – Stack, Queue & HashMap Implementations*](https://github.com/Pranshipatel/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-codebase/JavaDsaProgramming/src/com)

---

### 📅 Day 18 – Sorting Algorithms (Core & Advanced)  
**(Date: 05-Jan-2026)**

### 📘 Topics Covered

- Studied the importance of **Sorting Algorithms**:
  - Organizing data efficiently for faster searching, processing, and analysis.
  - Compared algorithms based on time complexity, space usage, and stability.

### 🔹 Core Sorting Algorithms

- **Bubble Sort**
- **Insertion Sort**
- **Merge Sort (Divide & Conquer)**
- **Quick Sort (Divide & Conquer)**
- **Heap Sort**
- **Selection Sort**

🔗 **Code Link:**  
👉 [*Day 18 – Sorting Algorithms Implementations*](https://github.com/Pranshipatel/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-codebase/JavaDsaProgramming/src/com)

--- 

### 📅 Day 19 – Searching Algorithms – Complete Overview  
**(Date: 06-Jan-2026)**

## 📘 Topics Covered

Focused on **Java best practices** for string handling and file I/O, along with **Linear Search and Binary Search**, reinforced through practical and challenge-based problems.

### 1. StringBuilder
- **Use When:** Frequent string modifications in loops or performance-critical code.

### 2. StringBuffer
- **Use When:** Thread-safe string manipulation is required.

### 3. FileReader
- **Use When:** Reading character-based text files.

### 4. InputStreamReader
- **Use When:** Converting byte streams to character streams.

### 5. Linear Search
- **Use When:** Data is unsorted or small.

### 6. Binary Search
- **Use When:** Data is sorted and fast lookup is required.

🔗 **Code Link:**  
👉 [*Day 19 – Searching Algorithms Implementation*](https://github.com/Pranshipatel/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-codebase/JavaDsaProgramming/src/com/searching)

---


## 📅 Day 20 – Runtime Analysis & Big O Notation  
**(Date: 07-Jan-2026)**


### 📝 Topics Covered

Studied **Big O Notation** to analyze **time and space complexity** and evaluate algorithm performance as input size grows.
### Algorithm Analysis & Big O – Scenario-Based Insights

- Studied **Big O Notation** to evaluate time & space complexity for growing inputs.

**Scenario-Based Learnings**

1. **Searching Large Datasets**
   - Linear Search → O(N)
   - Binary Search → O(log N)  Efficient for large, sorted data

2. **Sorting Algorithms**
   - Bubble Sort → O(N²)
   - Merge Sort → O(N log N)
   - Quick Sort → O(N log N) Avoid Bubble Sort for large inputs

3. **String Concatenation**
   - `String` → O(N²)
   - `StringBuilder` / `StringBuffer` → O(N) Mutable strings are faster

4. **Large File Reading**
   - `FileReader` → Slower (character-based)
   - `InputStreamReader` → Faster (byte-based) Efficient stream selection matters

5. **Fibonacci Computation**
   - Recursive → O(2ⁿ)
   - Iterative → O(N) Iterative is faster & memory-efficient

6. **Data Structure Lookups**
   - Array → O(N)
   - HashSet → O(1)
   - TreeSet → O(log N) HashSet offers fastest lookup; TreeSet maintains order

🔗 **Code Link:**  
👉 [*Day 20 – Runtime Analysis Implementation*](https://github.com/Pranshipatel/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-codebase/JavaDsaProgramming/src/algorithmanalysis)

---
## 📅 Day 22 – Real-World Scenario-Based DSA Problems  
**(Date: 10-Jan-2026)**

### 📝 Topics Covered

- Applied **core Data Structures** to practical problems.
- Focused on **efficient structure selection** and logical implementation.

#### Scenario-Based DSA Implemented
1. **BookShelf – Library Organizer**
   - `HashMap + LinkedList` for genre-wise book management.
   - Efficient insert/delete operations.

2. **BrowserBuddy – Tab History Manager**
   - `Doubly Linked List` for back/forward navigation.
   - `Stack` for recently closed tabs restoration.

3. **AmbulanceRoute – Emergency Navigation**
   - `Circular Linked List` for rotating through hospital units.
   - Dynamically remove unavailable units.

🔗 **Code:**  
👉 [Day 22 - Scenario-Based Data Structures](https://github.com/Pranshipatel/BridgeLabz-Training/tree/dsa-practice/dsa-practice/scenario-based/DsaScenarioBased/src)

---
## 📅 Day 23 – Advanced Scenario-Based DSA Problems  
**(Date: 12-Jan-2026)**

### 📝 Topics Covered
- Applied **Queues, Stacks, HashMaps, Priority Queues, and Doubly Linked Lists** to real-world systems.
- Focused on **efficient data handling, traversal, and state management**.
- Strengthened **interview-oriented problem-solving** using scenario-driven design.

#### Scenario-Based DSA Implemented

4. **CallCenter – Customer Queue Manager**
   - `Queue` for managing incoming customer calls.
   - `PriorityQueue` for handling VIP customers.
   - `HashMap` to track call frequency per customer.
   - Ensured fair processing with priority handling.

5. **TrainCompanion – Compartment Navigation System**
   - `Doubly Linked List` to model train compartments.
   - Enabled forward and backward traversal.
   - Supported dynamic insertion and removal of compartments.
   - Displayed adjacent compartments for quick navigation decisions.

6. **TextEditor – Undo/Redo Functionality**
   - `Stack` to track user actions (insert, delete, format).
   - Implemented **Undo** using the primary stack.
   - Maintained a separate stack for **Redo** operations.
   - Simulated real-world editor behavior with action history.

🔗 **Code:**  
👉 [Day 23 - Advanced Scenario-Based DSA](https://github.com/Pranshipatel/BridgeLabz-Training/tree/dsa-practice/dsa-practice/scenario-based/DsaScenarioBased/src)

---

