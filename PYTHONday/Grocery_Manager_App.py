
product_items = []

while True:
    print("1. Add Product")
    print("2. Remove Item")
    print("3. Display All Items")
    print("0. Exit")
    menu = input("Enter your menu: ")

    if menu == "1":
            add_product = input("Enter item to add: ")
            product_items.append(add_product)
            print(f"{add_product} added")

    elif menu == "2":
            remove_product = input("Enter item to remove: ")
            if remove_product in product_items:
                product_items.remove(remove_product)
                print(f"{remove_product} removed.")
            else:
                print("Item not found.")

    elif menu == "3":
            print("Display All Items:")
            if product_items:
                for item in product_items:
                    print( item)
            else:
                print("No items.")

    elif menu == "0":
            print("Exit")
            break

        
        

