const frutas = ["maçã"]
frutas.push("uvas", "banana", "laranja", "melancia")
frutas.pop()
frutas.splice(1,1)
console.log((frutas))
frutas.forEach((fruta, index) => {
    console.log(`${index}: ${fruta}`)

}
)