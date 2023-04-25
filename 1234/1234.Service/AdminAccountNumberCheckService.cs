namespace _1234
{
    using 1234.DataAccess;
    using 1234.DTO;

    public class AdminAccountNumberCheckService
    {
        private readonly AdminAccountNumberCheckRepository _repository;

        public AdminAccountNumberCheckService(AdminAccountNumberCheckRepository repository)
        {
            _repository = repository;
        }

        public AdminAccountNumberCheck GetAdminAccountNumberCheck(int id)
        {
            return _repository.GetAdminAccountNumberCheck(id);
        }

        public void InsertAdminAccountNumberCheck(AdminAccountNumberCheck adminAccountNumberCheck)
        {
            _repository.InsertAdminAccountNumberCheck(adminAccountNumberCheck);
        }

        public void UpdateAdminAccountNumberCheck(AdminAccountNumberCheck adminAccountNumberCheck)
        {
            _repository.UpdateAdminAccountNumberCheck(adminAccountNumberCheck);
        }

        public void DeleteAdminAccountNumberCheck(int id)
        {
            _repository.DeleteAdminAccountNumberCheck(id);
        }
    }
}