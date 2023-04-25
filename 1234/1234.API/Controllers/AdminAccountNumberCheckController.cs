namespace _1234.API
{
    using 1234.DataAccess;
    using 1234.DTO;
    using 1234.Service;
    using Microsoft.AspNetCore.Mvc;

    [Route("api/[controller]")]
    [ApiController]
    public class AdminAccountNumberCheckController : ControllerBase
    {
        private readonly AdminAccountNumberCheckService _service;

        public AdminAccountNumberCheckController(AdminAccountNumberCheckService service)
        {
            _service = service;
        }

        // GET: api/AdminAccountNumberCheck
        [HttpGet]
        public ActionResult<AdminAccountNumberCheck> GetAdminAccountNumberCheck(int id)
        {
            var adminAccountNumberCheck = _service.GetAdminAccountNumberCheck(id);
            if (adminAccountNumberCheck == null)
            {
                return NotFound();
            }

            return Ok(adminAccountNumberCheck);
        }

        // POST: api/AdminAccountNumberCheck
        [HttpPost]
        public ActionResult<AdminAccountNumberCheck> InsertAdminAccountNumberCheck(AdminAccountNumberCheck adminAccountNumberCheck)
        {
            _service.InsertAdminAccountNumberCheck(adminAccountNumberCheck);
            return CreatedAtAction(nameof(GetAdminAccountNumberCheck), new { id = adminAccountNumberCheck.Id }, adminAccountNumberCheck);
        }

        // PUT: api/AdminAccountNumberCheck
        [HttpPut]
        public ActionResult UpdateAdminAccountNumberCheck(AdminAccountNumberCheck adminAccountNumberCheck)
        {
            _service.UpdateAdminAccountNumberCheck(adminAccountNumberCheck);
            return NoContent();
        }

        // DELETE: api/AdminAccountNumberCheck/id
        [HttpDelete("{id}")]
        public ActionResult DeleteAdminAccountNumberCheck(int id)
        {
            _service.DeleteAdminAccountNumberCheck(id);
            return NoContent();
        }
    }
}