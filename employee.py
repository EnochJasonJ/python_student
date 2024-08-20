
def sec_high(ratings):
    ratings.sort(reverse=True)
    if len(ratings) >1:
        if ratings[0] > ratings[1] and ratings[1] >= 0:
            print(f"Output:\n Second highest rating: {ratings[1]}\n")
            # print(ratings[1])
        elif ratings[0] <= ratings[1] and ratings[1] >=0:
            print("Output: -1")
            print("\n")

        elif ratings[1] == " ":
            print("Output: -1")
            print("\n")
    else:
        print("Output: -1")
        print("\n")


ratings1 = [12, 35, 1, 10, 34, 1]
ratings2 = [10, 10]
ratings3 = [25, 45, 25, 35, 45, 55, 60, 55]
ratings4 = [5, 4, 3, 2, 1]
ratings5 = [100]
sec_high(ratings1)
sec_high(ratings2)
sec_high(ratings3)
sec_high(ratings4)
sec_high(ratings5)