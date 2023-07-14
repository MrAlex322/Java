from controller.VendingMachineController import VendingMachineController

class VendingMachineView:
    def __init__(self):
        self.vMachineController = VendingMachineController()

    def run(self):
        while True:
            print("1. Add product\n2. Get price list\n3. Get products by match pattern\n4. Exit")
            menu_choice = input("Enter your choice: ")

            # использование конструкции match
            match menu_choice:
                case "1":
                    product_type = input("Enter product type: ")
                    name = input("Enter product name: ")
                    cost = input("Enter product cost: ")
                    weight = input("Enter product weight: ")
                    product_data = {"name": name, "cost": cost, "weight": weight}
                    self.vMachineController.addProduct(product_type, product_data)
                    print("Product added successfully.")
                case "2":
                    print("Product price list:")
                    for price_item in self.vMachineController.getPpriceList():
                        print(price_item)
                case "3":
                    match_pattern = {}
                    match_pattern[input("Enter match pattern key: ")] = input("Enter match pattern value: ")
                    matching_products = self.vMachineController.getProductByMatchPattern(match_pattern)
                    print("Matching products:")
                    for product in matching_products:
                        print(product)
                case "4":
                    print("Goodbye!")
                    return
                case _:
                    print("Invalid choice, please enter a valid choice.")
