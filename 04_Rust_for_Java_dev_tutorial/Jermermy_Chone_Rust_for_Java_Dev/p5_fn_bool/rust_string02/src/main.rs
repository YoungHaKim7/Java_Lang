struct Contact {
    full_name: String,
    since: u16,
}

struct Contact02 {
    full_name: String,
    since: u16,
}

struct Contact03 {
    full_name: String,
    since: u16,
}

struct Contact04 {
    full_name: String,
    since: u16,
}

trait BusinessCard {
    fn card(&self) -> String;
}

impl BusinessCard for Contact04 {
    fn card(&self) -> String {
        format!("Business Card: {}", self.full_name)
    }
}

impl Contact02 {
    fn from_info(full_name: String, since: u16) -> Contact02 {
        return Contact02 { full_name, since };
    }
}

impl Contact03 {
    fn from_info(full_name: String, since: u16) -> Contact03 {
        Contact03 { full_name, since }
    }

    fn info(&self) -> String {
        format!("{} since: {}", self.full_name, self.since)
    }
}

impl Contact04 {
    fn from_info(full_name: String, since: u16) -> Contact04 {
        Contact04 { full_name, since }
    }

    fn info(&self) -> String {
        format!("{} since: {}", self.full_name, self.since)
    }
}

fn main() {
    let mut full_name = String::from("John");
    full_name.push_str(" Doe");
    println!("Hello {full_name}");
    println!("struct ~~~~~~~---------");
    let c1 = Contact {
        full_name: "John Doe".to_string(),
        since: 2005,
    };
    println!("Hello {} since: {}", c1.full_name, c1.since);
    println!("\nstruct & impl ~~~~~~~---------");
    let c2 = Contact02::from_info("John Doe".to_string(), 2005);
    println!("Hello {} since: {}", c2.full_name, c2.since);

    println!("\nstruct & impl & info ~~~~~~~---------");
    let c3 = Contact03::from_info("John Doe".to_string(), 2005);
    println!("Hello {} ", c3.info());

    println!("\nstruct & impl & trait ~~~~~~~---------");
    let c4 = Contact04::from_info("John Doe".to_string(), 2005);
    println!("Hello {} ", c4.info());
}
