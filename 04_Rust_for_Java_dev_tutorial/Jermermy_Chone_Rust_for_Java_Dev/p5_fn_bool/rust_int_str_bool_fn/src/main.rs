fn say_hello() {
    println!("say hello fn = hi");
    let coding: bool = true;
    println!("Hello world bool = {coding}");
}

fn say_if() {
    let coding: bool = true;
    let mut mood = if coding { "happy" } else { "sad" };
    println!("Hello if {mood}");
}

fn main() {
    let x: i16 = 123;
    let y = 132;
    let mut x_f64 = 123.9;
    x_f64 += 1.0;
    println!("Hello, world! x= {x} \n y : i32  = {y}");
    println!("x_f64= {x_f64}");
    println!("---------------------");
    say_hello();
    println!("---------------------");
    say_if();
    println!("---------------------");
    let full_name = "John Doe";
    println!("Hello {full_name}");
    println!("---String------------------");
    let mut full_name02 = String::from("John String::from");
    full_name02.push_str(" Doe");
    println!("Hello String::from = {full_name02}");
}
