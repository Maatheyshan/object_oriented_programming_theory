# Circle Function Interaction Documentation

This document explains how methods in `circletest.java` invoke and interact with functions in `circle.java`.

---

## Method Call Mapping

| Calling Class (`circletest.java`) | Called Method / Constructor (`circle.java`) | Function Purpose |
| :--- | :--- | :--- |
| `main(String[] args)` | `circle(double radius)` | **Constructor:** Initializes object instance, sets private `radius`, and increments static `objectCounter`. |
| `main(String[] args)` | `getRadius()` | **Getter:** Retrieves the stored `radius` value from the `circle` object. |
| `main(String[] args)` | `getArea()` | **Calculation:** Computes circle area ($\pi \times r^2$) and returns a `double`. |
| `main(String[] args)` | `getPerimeter()` | **Calculation:** Computes circumference ($2 \times \pi \times r$) and returns a `double`. |
| `main(String[] args)` | `getObjectCounter()` | **Static Getter:** Returns total number of `circle` instances created across the program. |

---

## Detailed Execution Flow

1. **`main(String[] args)`** initializes the console input via `Scanner`.
2. **`sc.nextDouble()`** reads the user's numeric input.
3. **`circle(userRadius)`** constructs the `circle` object and increments `objectCounter`.
4. **`obj.getRadius()`**, **`obj.getArea()`**, and **`obj.getPerimeter()`** are invoked sequentially to display object measurements.
5. **`circle.getObjectCounter()`** accesses the static class variable without needing to reference an individual instance variable directly.
6. **`sc.close()`** terminates input stream reading.