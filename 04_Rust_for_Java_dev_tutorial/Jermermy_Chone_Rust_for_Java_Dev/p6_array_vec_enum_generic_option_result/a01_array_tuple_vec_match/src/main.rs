use std::cmp::{Ord, Ordering};
use Option::{None, Some};

#[derive(Debug, Copy, Clone)]
struct Foo {}

struct Bar(u64, bool, Foo);

struct Container<T: Ord> {
    item: T,
}

impl<T: Ord> Container<T> {
    fn compare_item(&self, other_item: &T) -> Ordering {
        self.item.cmp(other_item)
    }
}

enum Activity {
    Sleeping(u8),   // number of hours slept
    Skiing(String), // ski resort
    Coding,
}

#[derive(Debug)]
enum Nullable<T> {
    Null,
    Value(T),
}

fn compare_items<T: Ord>(item1: &T, item2: &T) -> Ordering {
    item1.cmp(item2)
}

fn floor_divide(num: f32, by: f32) -> Result<i32, String> {
    if by == 0. {
        Err("Cannot divide by 0".to_string())
    } else {
        Ok((num / by).floor() as i32)
    }
}

fn main() {
    // 1) Array
    println!("~~~Array~~~~~");
    let arr1 = [1, 2, 3, 4];
    println!("item: {}", arr1[3]);
    let arr2: [u64; 5] = [1, 2, 3, 4, 5];
    println!("item: {}", arr2[4]);
    let arr3 = [10; 4];
    println!("item: {:?}", arr3);

    let arr4: [Foo; 4] = [Foo {}; 4];
    println!("item: {:?}", arr4);

    println!("\n~~~~~~~~~~~");
    println!("~~~Tuple~~~~~");
    let tuple1 = (123, true, Foo {});
    println!("item: {}", tuple1.1);

    println!("\n~~~~~~~~~~~");
    println!("~~~Vec~~~~~");
    // 3) Vec
    let mut arr5: Vec<u64> = Vec::new();
    arr5.push(123);
    println!("item: {}", arr5[0]);
    let mut arr6: Vec<u64> = Vec::new();
    arr6.push(123);
    println!("item: {:?}", arr6.get(0)); // item: Some(123)
    println!("item: {:?}", arr6.get(1)); // item: None

    println!("\n~~~~~~~~~~~");
    println!("~~~Enum~~~~~");
    // 4) enum
    // let activity_now = Activity::Skiing("Palisaders Tahoe".to_string());
    // let activity_now = Activity::Sleeping(9);
    let activity_now = Activity::Sleeping(6);
    let message = match activity_now {
        // match activity_now {
        // Activity::Sleeping(hours) => println!("Wake up! {}", hours),
        // Activity::Skiing(resort) => println!("Awwesome! {}", resort),
        // Activity::Coding => println!("Hopefully in Rust!"),
        Activity::Sleeping(hours) if hours > 8 => format!("Wake up! {}", hours),
        Activity::Skiing(resort) => format!("Awesome! {}", resort),
        Activity::Coding => format!("Hopefully in Rust!"),
        _ => format!("error code"),
    };
    println!("The massage is : {message:?}");

    println!("\n~~~~~~~~~~~");
    println!("~~~5) Generics ~~~~~");
    let c1 = Container { item: 123 };
    let c2 = Container {
        item: "Hello".to_string(),
    };
    println!("compare 1 : {:?}", c1.compare_item(&1));
    println!("compare 2 : {:?}", c2.compare_item(&"zzzz".to_string()));
    println!("compare 3 : {:?}", compare_items(&222, &111));

    println!("\n~~~~~~~~~~~");
    println!("~~~6) Option~~~~~");
    // let foo: Nullable<Foo> = Nullable::Null;
    // println!("Foo null = {foo:?}");
    // let foo: Nullable<Foo> = Nullable::Value(Foo {});
    // println!("Foo null = {foo:?}");
    // let foo: Option<Foo> = Option::None;
    let foo: Option<Foo> = Some(Foo {});
    println!("Option:: Foo = {foo:?}");

    println!("\n~~~~~~~~~~~");
    println!("~~~ 7) Result~~~~~");
    // let result = floor_divide(10., 0.); // max 값이 나온다.
    // let result = floor_divide(10., 4.); // max 값이 나온다.
    // println!("result: {result:?}");
    match floor_divide(10., 4.) {
        Ok(result) => println!("result : {result:?}"),
        Err(e) => println!("ERROR CAUGHT - {e}"),
    }
}
