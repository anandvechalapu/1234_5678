namespace _1234
{
    public class AdminAccountNumberCheckRepository
    {
        public AdminAccountNumberCheck GetAdminAccountNumberCheck(int id)
        {
            // Retrieve data from database
            // Return AdminAccountNumberCheck object
            return new AdminAccountNumberCheck() { Id = id };
        }

        public void InsertAdminAccountNumberCheck(AdminAccountNumberCheck adminAccountNumberCheck)
        {
            // Insert data into database
        }

        public void UpdateAdminAccountNumberCheck(AdminAccountNumberCheck adminAccountNumberCheck)
        {
            // Update data in database
        }

        public void DeleteAdminAccountNumberCheck(int id)
        {
            // Delete data from database
        }
    }
}