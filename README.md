# Java Banking System Simulation 🏦

## Project Overview
[cite_start]This project is a practical exercisefor the **Object-Oriented Programming (OOP)** module (Java) .

It simulates a basic banking system where `Clients` can own `Accounts` (Comptes). The system handles core banking operations such as deposits, withdrawals, transfers between accounts, and account management using fundamental OOP concepts.

## Key Features 🚀
* **Encapsulation:** usage of `private` attributes with Getters and Setters.
* **Static Members:** Automatic generation of unique Account IDs using a `static` counter.
* **Object Interaction:** Methods to transfer money between two objects (`transfererVers`) and compare balances.
* **Reference Manipulation:** A method to swap (permute) the information of two account objects.

## Project Structure 📂
The project consists of three main Java classes:

1.  **`Client.java`**:
    * Represents a bank client with a Name and CIN (ID Card).
    * Includes a constructor and display method.

2.  **`Compte.java`**:
    * Represents a bank account associated with a `Client`.
    * Manages the Balance (`solde`) and a unique Account Number (`numero`).
    * **Operations:** `deposer` (Deposit), `retirer` (Withdraw), `transfererVers` (Transfer).
    * **Analysis:** `differenceSoldes` (Diff), `comparerSoldes` (Compare), `permuterComptes` (Swap).

3.  **`TestCompte.java`**:
    * The main executable class.
    * Runs a predefined scenario to test all functionalities (Creation, Operations, Comparisons, and Permutation).

## Getting Started 🛠️

### Prerequisites
* Java Development Kit (JDK) installed (JDK 25).
* VS Code or any Java IDE.

### How to Run
1.  **Clone the repository** (or download the files).
2.  **Open a terminal** in the project folder.
3.  **Compile the Java files:**
    ```bash
    javac *.java
    ```
4.  **Run the main program:**
    ```bash
    java TestCompte
    ```

## Example Output 📊
Here is the expected output after running the test scenario:

```text
>> Depot de 2000 sur cp1 et Retrait de 500 sur cp2
>> Transfert de 200 DH de cp1 vers cp2
--- APRES OPERATIONS ---
Proprietaire de compte numero: 1
Client:Alami(CIN: AB344556)
Solde du compte: 2800.0DHs
Proprietaire de compte numero: 2
Client:Bennani(CIN: CD233445)
Solde du compte: 1700.0DHs
la difference entre ces 2 soldes est:1100.0DHs
le solde de compte numero: 1> a le solde de compte numero2
>> Permutation des comptes...
--- APRES PERMUTATION ---
Proprietaire de compte numero: 1
Client:Bennani(CIN: CD233445)
Solde du compte: 1700.0DHs
Proprietaire de compte numero: 2
Client:Alami(CIN: AB344556)
Solde du compte: 2800.0DHs
Nombre de comptes cree est : 2
