public class Menu_Submissions {

    public void Submissions()
    {

    }

    public void saleSubmission(Database database)
    {
        database.sales_result.submitSalesResult(database.getComissioned_employeeArrayList());
    }

    public void timecardSubmission(Database database)
    {
        database.timecard_controller.hourlyEmployeecontribution(database.getHourly_employeeArrayList());
    }

    public void serviceSubmission(Database database)
    {
        database.service_result.submitService(database.getEmployeeArrayList(),
                database.getHourly_employeeArrayList(),
                database.getComissioned_employeeArrayList(),
                database.getSalaried_employeeArrayList());
    }


}
