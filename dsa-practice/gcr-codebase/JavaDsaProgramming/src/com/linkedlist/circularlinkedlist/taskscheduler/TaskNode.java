package com.linkedlist.circularlinkedlist.taskscheduler;

//Node representing a Task in Circular Linked List
public class TaskNode {

int taskId;
String taskName;
int priority;
String dueDate;

TaskNode next;

// Constructor
public TaskNode(int taskId, String taskName, int priority, String dueDate) {
   this.taskId = taskId;
   this.taskName = taskName;
   this.priority = priority;
   this.dueDate = dueDate;
   this.next = null;
}
}