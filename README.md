# Java Foundations — Packages & Imports

This project demonstrates **how to define and organize Java classes using packages and imports**.  
It is designed to align with **Learning Objective 1** of the course:

> **"Define and organize Java classes using packages and imports"**

The examples here are **clip-ready** and cover **all import styles**:
- Single-class imports  
- Wildcard imports (`*`)  
- Static imports  
- Fully Qualified Names (FQN)  
- Cross-package imports

## **Project Structure**

java-foundations-packages-imports
└── src
└── com
└── pluralsight
├── app
│ └── App.java # Main demo entry point
├── finance
│ └── Money.java # Finance Money class
├── marketing
│ └── Money.java # Marketing Money class (name clash demo)
├── reports
│ └── ReportsDemo.java # Cross-package imports demo
└── utils
└── MathOps.java # Static imports demo

## **Key Concepts Demonstrated**

| **Concept**                | **Example**                                      | **Explanation**                                |
|---------------------------|---------------------------------------------------|-----------------------------------------------|
| **Single-class import**   | `import com.pluralsight.finance.Money;`          | Clean, most common approach                  |
| **Wildcard import**       | `import com.pluralsight.utils.*;`                | Demonstrated, but discouraged in practice    |
| **Static import**         | `import static com.pluralsight.utils.MathOps.add;` | Use static methods without class prefix      |
| **Fully Qualified Name**  | `com.pluralsight.marketing.Money`                | Required when two packages have same class name |
| **Cross-package imports** | Using `ReportsDemo` and `Money` in `App`         | Shows imports across unrelated packages      |

## **Expected Output**
Finance Money: 499.00 INR
Math Total: 22
Marketing Money: ₹499 (Marketing Price)
=== Monthly Report ===
Subscription: 999.00 INR
Projected Yearly Revenue: ₹11988
Marketing Display: ₹999 (Marketing Price)




