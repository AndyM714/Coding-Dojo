class User:
    def __init__(self, first_name, last_name, email, age, ) -> None:
        self.first_name = first_name
        self.last_name = last_name
        self.email = email
        self.age = age
        self.gold_card_points = 0
        self.is_rewards_member = False
    
    def dispaly_info(self):
        print(self.first_name)
        print(self.last_name)
        print(self.email)
        print(self.age)
        print(self.gold_card_points)
        print(self.is_rewards_member)
        
    def enroll(self):
        self.is_rewards_member = True
        self.gold_card_points = 200 

    def spend_points(self, amount):
        self.gold_card_points -= amount

        

JohnDoe = User("John", "Doe", "johndoe666@dead.com", 30, )


print(JohnDoe)
JohnDoe.dispaly_info()
JohnDoe.enroll()
print(JohnDoe.is_rewards_member)
JohnDoe.spend_points(50)
print(JohnDoe.gold_card_points)
