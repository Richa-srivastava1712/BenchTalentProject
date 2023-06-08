<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Add Project - WPC Spoc</title>
        <link href="css/styles.css" rel="stylesheet" />
        <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
        <style> h3.text-center.font-weight-light.my-4 {  color: blue;} .required-asterisk { color: red;}  </style>
    </head>
    <body class="bg-primary">
        <div id="layoutAuthentication">
            <div id="layoutAuthentication_content">
                <main>
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-7">
                                <div class="card shadow-lg border-0 rounded-lg mt-5">
                                    <div class="card-header"><h3 class="text-center font-weight-light my-4">Add Project</h3></div>
                                    <div class="card-body">
                                        <form action ="AddProjectServlet" method =post>
								  <div class="row mb-3">
								    <div class="col-md-6">
								      <div class="form-floating mb-3 mb-md-0">
								        <input class="form-control" name="inputReqNumber" type="text" placeholder="Enter Req Number" required>
								        <label for="inputReqNumber">Req Number<span class="required-asterisk">*</span></label>
								      </div>
								    </div>
								    <div class="col-md-6">
								      <div class="form-floating mb-3 mb-md-0">
								        <input class="form-control" name="inputJoiningLevel" type="text" placeholder="Enter Joining Level" required>
								        <label for="inputJoiningLevel">Joining Level<span class="required-asterisk">*</span></label>
								      </div>
								    </div>
								  </div>
								  <div class="row mb-3">
								    <div class="col-md-6">
								      <div class="form-floating mb-3 mb-md-0">
								        <input class="form-control" name="inputInitiatorName" type="text" placeholder="Enter Initiator Name" required>
								        <label for="inputInitiatorName">Initiator Name<span class="required-asterisk">*</span></label>
								      </div>
								    </div>
								    <div class="col-md-6">
								      <div class="form-floating mb-3 mb-md-0">
								        <input class="form-control" name="inputCustomer" type="text" placeholder="Enter Customer" required>
								        <label for="inputCustomer">Customer<span class="required-asterisk">*</span></label>
								      </div>
								    </div>
								  </div>
								  <div class="row mb-3">
								    <div class="col-md-6">
								      <div class="form-floating mb-3 mb-md-0">
								        <input class="form-control" name="inputPrimarySkill" type="text" placeholder="Enter Primary Skill">
								        <label for="inputPrimarySkill">Primary Skill<span class="required-asterisk">*</span></label>
								      </div>
								    </div>
								    <div class="col-md-6">
								      <div class="form-floating mb-3 mb-md-0">
								        <input class="form-control" name="inputSecondarySkill" type="text" placeholder="Enter Secondary Skill">
								        <label for="inputSecondarySkill">Secondary Skill<span class="required-asterisk">*</span></label>
								      </div>
								    </div>
								  </div>
								  <div class="row mb-3">
								    <div class="col-md-6">
								      <div class="form-floating mb-3 mb-md-0">
								        <input class="form-control" name="inputBand" type="text" placeholder="Enter Band">
								        <label for="inputBand">Band<span class="required-asterisk">*</span></label>
								      </div>
								    </div>
								    <div class="col-md-6">
								      <div class="form-floating mb-3 mb-md-0">
								        <input class="form-control" name="inputSubBand" type="text" placeholder="Enter Sub Band">
								        <label for="inputSubBand">Sub Band<span class="required-asterisk">*</span></label>
								      </div>
								    </div>
								  </div>
								  <div class="row mb-3">
								    <div class="col-md-6">
								      <div class="form-floating mb-3 mb-md-0">
								        <input class="form-control" name="inputExperience" type="text" placeholder="Enter Experience">
								        <label for="inputExperience">Experience<span class="required-asterisk">*</span></label>
								      </div>
								    </div>
								    <div class="col-md-6">
								      <div class="form-floating mb-3 mb-md-0">
								        <input class="form-control" name="inputCountry" type="text" placeholder = "Country">
								        <label for="inputCountry">Country<span class="required-asterisk">*</span></label>
								      </div>
								     </div>
								    </div>
								    <div class="row mb-3">
								    <div class="col-md-6">
								        <div class="form-floating mb-3 mb-md-0">
								            <input class="form-control" name="inputPersonalArea" type="text" placeholder="Enter Personal Area" />
								            <label for="inputPersonalArea">Personal Area<span class="required-asterisk">*</span></label>
								        </div>
								    </div>
								    <div class="col-md-6">
								        <div class="form-floating mb-3 mb-md-0">
								            <input class="form-control" name="inputPeronalSubarea" type="text" placeholder="Enter Personal Sub Area" />
								            <label for="inputPeronalSubarea">Personal SubArea<span class="required-asterisk">*</span></label>
								        </div>
								      </div>
								    </div>
								    <div class="row mb-3">
								    <div class="col-md-6">
								        <div class="form-floating mb-3 mb-md-0">
								            <input class="form-control" name="inputJob" type="text" placeholder="Enter Job" />
								            <label for="inputJob">Job<span class="required-asterisk">*</span></label>
								        </div>
								    </div>
								    <div class="col-md-6">
								        <div class="form-floating mb-3 mb-md-0">
								            <input class="form-control" name="inputJobFamily" type="text" placeholder="Enter JobFamily" />
								            <label for="inputJobFamily">Job Family<span class="required-asterisk">*</span></label>
								        </div>
								      </div>
								    </div>
								    <div class="row mb-3">
								    <div class="col-md-6">
								        <div class="form-floating mb-3 mb-md-0">
								            <input class="form-control" name="inputPendingWith" type="text" placeholder="Enter PendingWith" />
								            <label for="inputPendingWith">Pending With</label>
								        </div>
								    </div>
								    <div class="col-md-6">
								        <div class="form-floating mb-3 mb-md-0">
								            <input class="form-control" name="inputDesignation" type="text" placeholder="Enter Designation" />
								            <label for="inputDesignation">Designation<span class="required-asterisk">*</span></label>
								        </div>
								      </div>
								    </div>
									<div class="row mb-3">
									    <div class="col-md-12 mt-3">
									        <div class="form-floating mb-3 mb-md-0">
									            <textarea class="form-control" name="inputJobDescription" placeholder="Enter Job Description" maxlength="1000" rows="5"></textarea>
									            <label for="inputJobDescription">Job Description (100-200 words)</label>
									        </div>
									    </div>
									</div>
									<div class="col-12" style="text-align:center;">
            											 <button type="submit" class="btn btn-primary btn-block" id="submitbtn">Add Project</button> 
           											 
          							</div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </main>	
            </div>
            <div id="layoutAuthentication_footer">
                <footer class="py-4 bg-light mt-auto">
                    <div class="container-fluid px-4">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted">Copyright &copy; HCL Bench Talent 2023</div>
                            <div>
                                <a href="#">Privacy Policy</a>
                                &middot;
                                <a href="#">Terms &amp; Conditions</a>
                            </div>
                        </div>
                    </div>
                </footer>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="js/scripts.js"></script>
    </body>
</html>
