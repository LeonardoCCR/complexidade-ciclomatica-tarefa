# 📂 Projeto IMC

O **código principal** deste projeto se encontra em:  
`complexidade-ciclomatica-tarefa/Imc_project/src/main/java/Imc.java`

---

# 📊 Complexidade Ciclomática (McCabe)

A **complexidade ciclomática** é uma métrica criada por McCabe (1976) para medir a **quantidade de caminhos independentes** dentro de um programa.  
Ela mostra o quanto um código é **simples ou complexo** de entender, manter e testar.

---

## 🔹 Fórmulas

### 1. Formal (grafo de fluxo)
\[
M = E - N + 2P
\]  

- **E**: número de arestas (ligações entre blocos)  
- **N**: número de nós (blocos de código)  
- **P**: componentes conexos (normalmente 1 por função)

### 2. Prática (mais usada)
\[
M = \text{número de decisões} + 1
\]

---

## 🔹 O que conta como decisão?

- `if` → +1  
- `else if` → +1  
- `for`, `while`, `do while` → +1  
- `case` em `switch` → +1  
- `catch` → +1  
- Operador ternário (`?:`) → +1  

⚠️ **Observações:**  
- `else` puro **não aumenta** a complexidade.  
- Condições compostas com `&&` ou `||` **contam como 1 decisão apenas**.

---

## 🔹 Exemplo

```java
if (x > 0) {      // +1 decisão
    if (y > 0) {  // +1 decisão
        return 1;
    }
} else {          // não soma
    return -1;
}
return 0;
